package frc.robot;

import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

import edu.wpi.cscore.CvSink;
import edu.wpi.cscore.CvSource;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.cscore.VideoSink;
import edu.wpi.first.cameraserver.CameraServer;

public class Vision extends Robot {

    private VideoSink server;
    private UsbCamera camera;
    private UsbCamera camera1;

    public Vision(){

        new Thread(() -> {
            camera = CameraServer.getInstance().startAutomaticCapture(0);
            camera1 = CameraServer.getInstance().startAutomaticCapture(1);

            camera.setResolution(640, 480);
            camera1.setResolution(640, 480);

            server = CameraServer.getInstance().getServer();
            CvSink cvSink = CameraServer.getInstance().getVideo();
            CvSource outputStream = CameraServer.getInstance().putVideo("Blur", 640, 480);
            
            Mat source = new Mat();
            Mat output = new Mat();
            
            while(!Thread.interrupted()) {
                cvSink.grabFrame(source);
                Imgproc.cvtColor(source, output, Imgproc.COLOR_BGR2GRAY);
                outputStream.putFrame(output);
            }
        }).start();

    }

    public void setCamera(){
        server.setSource(camera);

    }

    public void setCamera1(){
        server.setSource(camera1);

    }

}