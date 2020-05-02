package com.zorin.cons;

enum OrderStatus {
	PENDING,ACCEPTED,REJECTED,CANCELLED
}

public class EnumDemo {
	public static void main(String[] args) {
		OrderStatus status=OrderStatus.ACCEPTED;
		System.out.println(status);
		
		String stat="CANCELLED";
		
		OrderStatus st = OrderStatus.valueOf(stat);
		System.out.println(st);
	}
}
