package com.dz5;

@SuppressWarnings("serial")
public class MyException extends Exception {
	// создание конструктора по умолчанию
	public MyException() {
		super();
	}

	// создание конструктора, в который будет добавлено текстовое сообщение об
	// исключительнйо ситуации
	public MyException(String description) {
		super(description);
	}
}
