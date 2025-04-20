class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        ArrayDeque<Integer> student=new ArrayDeque<>();
        ArrayDeque<Integer> sandwich=new ArrayDeque<>();
        int i=0;
        while(i<students.length){
            student.add(students[i]);
            sandwich.add(sandwiches[i]);
            i++;
        }
        int count=0;
        while(!student.isEmpty()&& count<student.size()){
            if(student.peekFirst().equals(sandwich.peekFirst())){
                student.pollFirst();
                sandwich.pollFirst();
                count=0;
            }
            else{
                student.addLast(student.pollFirst());
                count++;
            }
        }

        return student.size();
    }
}