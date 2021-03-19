package Matematika_Parameter;

public class Matematika {
    int operasi;

    // Method Pertambahan
    void pertambahan (int a, int b){
        operasi = a + b;
    }
    void pengurangan (int a, int b){
        operasi = a - b;
    }
    void perkalian (int a, int b){
        operasi = a * b;
    }
    void pembagian (int a, int b){
        operasi = a / b ;
    }
    int getOperasi(){
        return operasi;
    }
}



