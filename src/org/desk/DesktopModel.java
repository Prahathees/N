package org.desk;

public class DesktopModel{

	public void softwareResources() {
System.out.println("soft");		
	}

	public void hardwareResources() {
System.out.println("hard");		
	}
public static void main(String[] args) {
	DesktopModel d = new DesktopModel();
	d.hardwareResources();
	d.softwareResources();
}
}
