
<head>

<style>
       span
       { 
            color:red;
            font-size:30px;
       }
       select
       {
            margin-top:50px;
            padding:20px 100px;
            background-color:black;
            color:white;
            
            font-size:30px;
            margin-left:300px;
       }
       body
       { 
         background-color:pink;
       }
       
        input[type="submit"]
        {
            padding:15px 20px;
            color:red;
            background-color:yellow;
            border-radius:10%;
            margin-left:100px;
        }
          


   </style>


   
<script>

var xmlhttp;

function getAllSubjects()
{
	xmlhttp=new XMLHttpRequest();

	xmlhttp.onload=showAllSubjects;
	
	xmlhttp.open("get","getAllSubjects",true);

	xmlhttp.send();
	
}

function showAllSubjects()
{
	
	//alert(xmlhttp.responseText);
	var allsubjects = JSON.parse(xmlhttp.responseText);
	//alert(allsubjects);
	var combobox=document.getElementById("selectedSubject");

	for(var i=0;i<allsubjects.length;i++)
	{
		var option=document.createElement('option');
		option.text=allsubjects[i];
		option.value=allsubjects[i];
		combobox.add(option);
	}
}

</script>

</head>

<body onload="getAllSubjects()">

<span>${message}</span>

<form>
		<select name="selectedSubject" id="selectedSubject">
			
		</select>
		
		<input type=submit value="startExam" formaction="startExam">
</form>
	
</body>