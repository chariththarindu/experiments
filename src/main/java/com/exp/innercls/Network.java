package com.exp.innercls;

import java.util.ArrayList;

public class Network {

	private  boolean hasMember = false;
	private static class Member {

		private String name = null;
		private int age = 0;
		private ArrayList<Member> friends;

		public Member(String name, int age) {
			this.name = name;
			this.age = age;
			friends = new ArrayList<Member>();
			//hasMember= true;
		}
	}
	
	
	private void inClass() {
		
		if(1>0) {
			class Test{
				
			}
		}
		
		
	}

	private ArrayList<Member> members = new ArrayList<>();

	public Member enroll(String name, int age) {
		Member newMember = new Member(name, age);
		members.add(newMember);
		return newMember;
	}

	public void deactivate() {
		members.remove(this);
	}

	public static void main() {

		Network network = new Network();
		//Network.Member member1 = network.new Member("charith", 32);

		Network.Member m = new Network.Member ("charith", 23);
		
		
		Network.Member member = network.enroll("charit", 32);

	}
}
