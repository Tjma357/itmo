package com.dz5;

@SuppressWarnings("serial")
public class MyException extends Exception {
	// �������� ������������ �� ���������
	public MyException() {
		super();
	}

	// �������� ������������, � ������� ����� ��������� ��������� ��������� ��
	// �������������� ��������
	public MyException(String description) {
		super(description);
	}
}
