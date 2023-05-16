abstract class Employement{
        public empName:string;
        public empId:number;
        constructor(empName:string,empId:number){
            this.empId=empId;
            this.empName=empName;
        }
        public abstract salary();
    }
    class FullTime extends Employement{
        public hoursWorked:number;
        public pricePerHour:number;
        constructor(empName:string,empId:number,hoursWorked:number,pricePerHour:number){
                super(empName,empId);
                this.hoursWorked=hoursWorked;
                this.pricePerHour=pricePerHour;
        }
        public salary() {
            let sal:number = this.hoursWorked*this.pricePerHour;   
            console.log("Salary of : "+this.empName+" is "+sal);
        }
    }
    class PartTime extends Employement{
        public hoursWorked:number;
        public pricePerHour:number;
        constructor(empName:string,empId:number,hoursWorked:number,pricePerHour:number){
                super(empName,empId);
                this.hoursWorked=hoursWorked;
                this.pricePerHour=pricePerHour;
        }
        public salary() {
            let sal:number = this.hoursWorked*this.pricePerHour;   
            console.log("Salary of : "+this.empName+" is "+sal);
        }
    }
    let arun = new FullTime('Arun Kumar',2345,9,1500);
    arun.salary();
    
    