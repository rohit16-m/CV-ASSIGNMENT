const form = document.getElementById('myForm');


form.addEventListener('submit', function (e) {
    e.preventDefault(); 
    
    let first = document.getElementById('first').value;
    let last = document.getElementById('last').value;
    let dob = document.getElementById('dob').value;
    let country = document.getElementById('country').value;
    let gender = document.getElementById('gender').value;
    let profession = document.getElementById('profession').value;
    let email = document.getElementById('email').value;
    let mobile = document.getElementById('mobile').value;

    let formData =`First name : ${first} \n Last name : ${last} \n Last name : ${dob} \n Last name : ${country} \n Last name : ${gender} \n Last name : ${profession} \n Last name : ${email} \n Last name : ${mobile} `;

    alert(formData)
    
});



