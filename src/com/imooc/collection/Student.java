package com.imooc.collection;

import java.util.HashSet;
import java.util.Set;
/**
 * ѧ����
 * @author ��ͥ����
 *
 */

public class Student {
  String id;
  String name;
  public Set courses;
  public Student(String id,String name){
	  this.id = id;
	  this.name = name;
	  this.courses = new HashSet();
  } 
}
