// we use triple === to comparate value an type of the variable

let a = 1
let b = 1

// Its better to use === than ==
// comparing type and value
if (a === b) {
    console.log("Equal")
} else {
    console.log('Not equal')
}

let x = 0
let y = '0'

if (x === y) {

    console.log("Equal")

}
else {
    console.log('Not Equal')
}

let m = 8
let n = '8'


// Thats following example is true
if (m == n) {
    console.log('Equal') // 

} else {
    console.log('Not Equal')
}