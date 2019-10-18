package com.logo.patrones.factory;

import java.util.HashMap;
import java.util.Map;

import com.logo.patrones.factory.dog.BigDog;
import com.logo.patrones.factory.dog.Dog;
import com.logo.patrones.factory.dog.DogEnum;
import com.logo.patrones.factory.dog.MediumDog;
import com.logo.patrones.factory.dog.SmallDog;

public class DogFactory {

	Map<String, Dog> dogMap = new HashMap<>();

	public DogFactory() {
		dogMap.put(DogEnum.SMALL_DOG.getDog(), new SmallDog());
		dogMap.put(DogEnum.MEDIUM_DOG.getDog(), new MediumDog());
		dogMap.put(DogEnum.BIG_DOG.getDog(), new BigDog());
	}

	public Dog getDog(String dogType) {
		return dogMap.get(dogType);
	}

}
