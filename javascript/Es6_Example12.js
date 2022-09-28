class Student{ 
    constructor(name, age) { 
    this.n = name; 
    this.a = age; 
    } 
    stu() { 
    console.log("The Name ofthe studentis: ",this.n) 
    console.log("The Age ofthe studentis: ",this. a) 
    } 
   } 
    
   varstuObj = new Student('Peter',20); 
   stuObj.stu(); 
   