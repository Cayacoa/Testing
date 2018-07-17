/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundamentals;
public class OOP extends ExtendsRodentia {

	String name;

	public OOP(String name) {

		this.name = name;

	}

	public void eat() {

		System.out.println(name + " ate some cheese pizza!");

	}

	public void solveMaze(int minutes) {

		System.out.println(name + " solved the maze in " + minutes + " minutes!");

	}

	public static void main(String[] args) {

		OOP ratly = new OOP("Ratly");
		ratly.eat();
		ratly.solveMaze(3);
		ratly.order();

	}

}