package �dev3;

public class StudentManager extends UserManager{
	public void CommendAdd (Student student ,Instructor instructor ) {
		System.out.println(student.getUsername()+" :"+ student.getComment()+" "+"yorum yap�ld� .");
		System.out.println(instructor.getUsername()+ " yorumu be�endi");
	}
	

}
