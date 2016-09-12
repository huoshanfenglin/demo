package com.demo.future.demo;

public class Model {
	private double x;
	private double y;
	private double z;
	private double t;
	private String group;

	public Model() {
		super();
	}

	public Model(double x, double y, double z, double t, String group) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.t = t;
		this.group = group;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getT() {
		return t;
	}

	public void setT(double t) {
		this.t = t;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

}
