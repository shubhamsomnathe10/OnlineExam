${message}

<html>
<head>
   <style>

     .btn
         {
            padding:15px 30px;
            background-color: yellow;
            color: red;
            font-size:20px;
   
            }
     body
        {
            background-color:grey;
        } 
            
     div   
        {
            text-align:center;
            margin-top:200px;
            border:2px solid blue;
            margin-left:300px;
            padding:30px;
            width:500px;
                 
        }  
            
     .c1      
        {
            padding:10px;
        }
   </style>            
</head>  
<br><br> 

<body>

<div>
<form>
	<input type="text" name="username" placeholder="Enter Username"  class="c1" ><br><br>
	<input type="password" name="password" placeholder="Enter Password" class="c1" ><br><br> 
	<input type="submit" value="Login" formaction="validate" class="btn">&nbsp;&nbsp; 
	<input type="submit" value="Register" formaction="showRegister" class="btn">
</form>
</div>
</body>
</html>
