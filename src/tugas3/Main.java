package tugas3;

import tugas3.academics.Administrator;
import tugas3.academics.Alumnus;
import tugas3.academics.Employee;
import tugas3.academics.Faculty;
import tugas3.academics.Staff;
import tugas3.academics.Student;
import tugas3.academics.Teacher;

public class Main {
  public static void main(String[] args) {

    System.out.println("""
        Nama:\tAchmad Raihan
        NIM :\t09020623015
        """);

    System.out.println("Welcome to our University!");
    Teacher teacher = new Teacher("Achmad S.Kom", "achmadskom@gmail.com", "123456789101112", "Information System", "Lecturer");
    teacher.attendEvent();
    teacher.teach();

    Employee employee = new Employee("Ahmad Surya", "ahmadsurya@gmail.com", "E001", "Finance");
    employee.work();

    Student student = new Student("Achmad Raihan","achmadraihandu@gmail.com", "09020623015", "Information System");
    student.attendEvent();
    student.study();

    Alumnus alumnus = new Alumnus("Nopin", "nopin@gmail.com", "2024");
    alumnus.donate();

    Faculty faculty = new Faculty("Dr. Ratna Sari", "ratnasari@gmail.com", "F1234", "Physics", "Profesor");
    faculty.conductResearch();

    Staff staff = new Staff("Joko", "joko@gmail.com", "S001", "Library Services");
    staff.supportOperations();

    Administrator admin = new Administrator("Dr. Budi Setiawan", "budisetiawan@gmail.com", "A001", "Mathematics", "Dean", "Department Head");
    admin.manageDepartment();
  }
}

/*
1. Enkapsulasi (Encapsulation)
Enkapsulasi adalah penggabungan data (attribute) dan method (fungsi) yang beroperasi pada data ke dalam satu kelas.
Hal ini juga melibatkan pembatasan akses langsung ke beberapa komponen objek, 
itulah sebabnya mengapa kelas sering kali memiliki bidang pribadi dengan method pengambil dan pengatur publik.

Aplikasi dalam Kode:
Setiap kelas (CommunityMember, Employee, Faculty, dll.) mengenkapsulasi datanya (seperti nama, email, employeeId, dll.) 
dan perilakunya (method seperti attendEvent(), work(), dll.) ke dalam satu unit.
Sebagai contoh, kelas Student mengenkapsulasi attribute nama, email, studentId, dan jurusan dari seorang siswa, bersama dengan method study() yang mendefinisikan perilaku seorang siswa.

2. Pewarisan (Inheritance)
Pewarisan memungkinkan kelas baru (subkelas atau kelas anak) mewarisi properti dan method dari kelas yang sudah ada (kelas super atau kelas induk).
Hal ini mendorong penggunaan ulang kode dan membangun hubungan hierarki antar kelas.

Aplikasi dalam Kode:
Kelas Employee mewarisi dari CommunityMember, yang berarti Employee mendapatkan semua attribute dan method dari CommunityMember (seperti nama, email, dan attendEvent()), 
dan juga dapat memiliki attribute dan method tambahan khusus untuk karyawan.

Demikian pula, kelas Faculty dan Staff mewarisi dari Employee, dan Teacher dan Administrator mewarisi dari Faculty.
Pewarisan ini menciptakan sebuah hirarki, yang memungkinkan kelas-kelas yang lebih spesifik untuk menggunakan kembali dan memperluas fungsionalitas kelas yang lebih umum.

3. Polimorfisme (Pholymorphism)
Polimorfisme memungkinkan objek-objek dari kelas yang berbeda diperlakukan sebagai objek dari superclass yang sama. 
Hal ini juga memungkinkan satu method untuk memiliki implementasi yang berbeda tergantung pada objek yang dipanggil.

Aplikasi dalam Kode:
Polimorfisme terlihat jelas dalam cara method dapat ditimpa. 
Sebagai contoh, jika kelas Teacher membutuhkan implementasi khusus dari work() yang berbeda dari kelas Employee, maka kelas tersebut bisa menimpa method work().

Anda dapat memiliki method yang menerima parameter CommunityMember dan memanggil method attendEvent(). 
Bergantung pada apakah Anda mengoper objek Murid, Guru, atau Alumni, perilakunya bisa sedikit berbeda jika kelas-kelas tersebut menimpa method tersebut.
 */