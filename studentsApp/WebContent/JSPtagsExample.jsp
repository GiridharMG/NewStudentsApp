<%! 
	private int age = 100;
	public String name = "Rajani Kanth";
	
	{
		System.out.println("Inside My Block");
	}
	
	public int getAge(){
		return age;
	}
	
	public String getName(){
		return name;
	}
	
	public String getName(String givenNm){
		return "Given Name is : "+givenNm;
	}
%>

<html>
<body>
	<h1>JSP Tags Example ...</h1>
	<BR><BR>
	Age 1 : <%= age %> <BR>
	Age 2 : <%= getAge() %> <BR><BR>
	Name 1 : <%= name %> <BR>
	Name 2 : <%= getName()%> <BR>
	Name 3 : <%= getName("Praveen")%> <BR>
	Name 4 : <%= name+getName()+getName("Praveen")%> <BR>
	
	<BR><BR>
	
	<%
		boolean isTrue = true;
		for(int i=0; i<5; i++)
		{
	%>
			Age : <%= age %>
			
	<%		for(int j=0; j<5; j++)
			{
	%>
				Name : <%= name %> 
				<BR>
	<%		}
		}
	%>
	
</body>
</html>












