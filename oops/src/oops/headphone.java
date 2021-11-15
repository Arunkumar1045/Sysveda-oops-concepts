package oops;

public class headphone {
String charge ="micro usb";
String []controls= {"power","volume","skip","play/pause"};
String color="red/black";
static boolean power= false;
static int volume=0;
public static void poweron() {
	power=true;
}
public static void poweroff() {
	power=false;
}
public static void volumeup() {
	volume++;
}
public static void volumedown() {
	volume--;
}
}
