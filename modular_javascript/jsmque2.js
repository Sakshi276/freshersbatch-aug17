
function emp(empid,ename,empSalary,deptno)
{
		this.empid = empid;
		this.ename = ename;
		this.empSalary = empSalary;
		this.deptno = deptno;
}
var emplist = (function() {
		var emps=[];
		var obj ={
			addEmp: function(emp)
		{
			emps.push(emp);	
		},
		getEmps: function()
		{
			return emps;	
		}		
		};
		return obj;
		
})();

function emptest()
{
var obj1=new emp(05,"aaa",100000,12);
emplist.addEmp(obj1);
var obj2=new emp(02,"bbb",200000,22);
emplist.addEmp(obj2);



var emps=emplist.getEmps();
console.log("Emploees=",emps);

var srted=emplist.sort();
console.log("Sorted list: ",emps);


}