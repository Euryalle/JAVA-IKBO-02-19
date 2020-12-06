package com.company;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> st = new ArrayList<Student>();
        SortingStudentsByGPA comp = new SortingStudentsByGPA();
        st.add(new Student("Dmitriy",20));
        st.add(new Student("Andrey",15));
        st.add(new Student("Artyom",30));
        st.add(new Student("Anton",100));
        Student[] stud = st.toArray(new Student[0]);
        QuickSort(stud,0,stud.length-1,comp);
        for(Student arr: stud) {
            System.out.println(arr.StudentName + " " + arr.FinalScore);
        }
    }

    public static void QuickSort(Student[] list, int low, int high, Comparator<Student> comp) {
        if (list.length != 0) {
            if (low <= high) {
                int middle = low + (high - low) / 2;
                Student supp = list[middle];
                int i = low, j = high;
                while (i <= j) {
                    while (comp.compare(list[i],supp) >= 0){
                        i++;
                    }

                    while (comp.compare(list[j],supp) < 0) {
                        j--;
                    }

                    if (i <= j) {//меняем местами
                        Student temp = list[i];
                        list[i] = list[j];
                        list[j] = temp;
                        i++;
                        j--;
                    }
                }

                if (low < j) {
                    QuickSort(list, low, j, comp);
                }
                if (high > i) {
                    QuickSort(list, i, high, comp);
                }
            }
        }
    }

    public static class Student implements Comparable<Student> {
        public String StudentName;
        private ArrayList<String> IDNumber;
        private int FinalScore;

        Student(String StudentName, int FinalScore) {
            this.StudentName = StudentName;
            this.FinalScore = FinalScore;
        }

        public int getFinalScore() {
            return FinalScore;
        }

        public void setFinalScore(int finalScore) {
            FinalScore = finalScore;
        }

        @Override
        public int compareTo(Student S) {
            return 0;
        }
    }

    private static class SortingStudentsByGPA implements Comparator<Student>{
        @Override
        public int compare(Student a, Student b){
            if(a.getFinalScore() < b.getFinalScore()){
                return 0;
            }else if(a.getFinalScore() > b.getFinalScore()){
                return -1;
            } else{
                return 1;
            }

        }
    }
}


