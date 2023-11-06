
let result=0;
let operator;

function setValue(n){
    num=document.getElementById(n).getAttribute('value');

    result =document.getElementById('input').value +=num
}

function solve(){
    finalResult=eval(result);
    document.getElementById('input').value =finalResult
}

function allClear(){
    document.getElementById('input').value =''
}

