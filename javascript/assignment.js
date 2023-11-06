let string = 'This is a sunny day';

let newS = string.split(' ')

let reverse = newS.map((word)=>(
    word.split('').reverse().join('')
));

let result = reverse.join(' ');

console.log(result);