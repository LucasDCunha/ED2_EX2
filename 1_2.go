package main
import ("fmt")

func main() {
    var j int
    
    fmt.Print("Insira um numero: ")
    fmt.Scan(&j)
   
    for i := 0; i <= j; i++ {
	    fmt.Println("Contador: ", i)
    }
}

/* Complexidade: O(n) */
