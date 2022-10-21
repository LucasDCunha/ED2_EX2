using System; 

class MainClass {
  public static void Main (string[] args) {
  
  int num = int.Parse(Console.ReadLine());
  int cont = 1;
  
  for(int i = 1; i < num; i++){
    if(num % i == 0){
      cont = cont + 1;
    }
  }
  
  if(cont == 2)
    Console.WriteLine("O numero {0} e primo", num);
  else
    Console.WriteLine("O numero {0} NAO E primo", num);
  }
}

// Complexidade: O(n) 
