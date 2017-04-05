package com.imooc.collection;

import java.util.HashSet;
import java.util.Set;
/**
 * 学生类
 * @author 家庭电脑
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
