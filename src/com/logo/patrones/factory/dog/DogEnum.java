package com.logo.patrones.factory.dog;

public enum DogEnum {
	BIG_DOG("BIG_DOG", "big dog"), MEDIUM_DOG("MEDIUM_DOG", "medium dog"), SMALL_DOG("SMALL_DOG", "small dog");

	private final String dog;
	private final String descripcion;

	private DogEnum(String dog, String descripcion) {
		this.dog = dog;
		this.descripcion = descripcion;
	}

	public String getDog() {
		return dog;
	}

	public String getDescripcion() {
		return descripcion;
	}

}
