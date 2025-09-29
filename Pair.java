package Newpack;

import java.util.LinkedList;

public class Pair {

	int id;
	String name;
	Pair(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public class LinkedListwithJava{
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<Pair>list=new LinkedList<>();
list.add(new Pair(1,"Marry"));
list.add(new Pair(2,"Mohammed"));
for(Pair p:list)
{
	System.out.println("ID:"+p.id+,"Name:  +p.name");
}
	}

}
}
