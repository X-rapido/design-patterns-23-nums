package com.example.Interaction_mode.备忘录模式;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 备忘录类
 */
@Data
@AllArgsConstructor
public class Memento {
	private String name;
	private String sex;
	private int age;

}
