package com.exp.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestThread {

	public static void main(final String[] arguments) throws InterruptedException, ExecutionException {

		ExecutorService executor = Executors.newSingleThreadExecutor();

		System.out.println("Factorial Service called for 10!");
		Future<Long> result10 = executor.submit(new FactorialService(10));

		System.out.println("Factorial Service called for 20!");
		Future<Long> result20 = executor.submit(new FactorialService(20));

		Long factorial10 = result10.get();
		System.out.println("10! = " + factorial10);

		Long factorial20 = result20.get();
		System.out.println("20! = " + factorial20);
		int z = 2;
		Callable<Long> cal = () -> {
			long result = 1;
			int a = z;
			while (a != 0) {
				result = a * result;
				a--;
				Thread.sleep(100);
			}
			return result;
		};
		Future<Long> resultadd = executor.submit(() -> {
			return 2l + z;
		});

		System.out.println("20! = " + resultadd.get());
		executor.shutdown();
	}

	static class FactorialService implements Callable<Long> {

		private int number;

		@Override
		public Long call() throws Exception {
			// TODO Auto-generated method stub
			return Factorial();
		}

		public FactorialService(int fac) {
			this.number = fac;
		}

		private Long Factorial() throws InterruptedException {
			long result = 1;

			while (number != 0) {
				result = number * result;
				number--;
				Thread.sleep(100);
			}
			return result;
		}
	}

}
