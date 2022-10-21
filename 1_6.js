const total = [1,2,3,4,5,6,7,8,9,10];
let indisp = [1,4,8,9];

function checkDisp(num) {
    let result = true
    indisp.forEach(el => {
        if(el == num) {
            result = false
        }
    });
    return result
}

function run(opt) {
    if(checkDisp(opt)) {
        console.log('Assento registrado com sucesso!')
    } else console.log('Assento indisponivel!')
}

let opt = 2
run(opt)

opt = 4
run(opt)

// Complexidade: O(n)
