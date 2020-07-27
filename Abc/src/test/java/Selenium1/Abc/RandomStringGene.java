package Selenium1.Abc;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomStringGene {

	public static void main(String[] arg) {
		String rand = RandomStringUtils.randomAlphanumeric(2, 5);

		System.out.println(rand);

		String randnum = RandomStringUtils.randomNumeric(10);

		System.out.println(randnum);
	}

}
