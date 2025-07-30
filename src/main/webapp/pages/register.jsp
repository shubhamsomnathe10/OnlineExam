<head>

   <style>
           div
           {
                border:15px solid blue;
                padding:50px;
                width:25%;
                margin:auto;
                text-align:center;
                
           }
           input
           {
                border:2px solid black;
                border-radius:10px;
                padding:10px;
                margin-left:20px;
                margin-bottom:10px;

           }
           #b1
           {
                padding:15px 30px;
                background-color:yellow;
                color:blue;
           }

   </style>
   
   <script>
           function change(input)
           {
        	    input.style.color="white";
        	    input.style.background="black";
           }
   </script>

</head>

<form>
<div>
<input type="text" name ="username" placeholder="Enter Username" onfocus="change(this)" required><br><br>
<input type="password" name ="password" placeholder="Enter Password" onfocus="change(this)"><br><br>
<input type="text" name="mobilenumber" placeholder="Enter Mobile Number" onfocus="change(this)" required><br><br>
<input type=email name="emailid" Placeholder="Enter EmailID" onfocus="change(this)"><br><br>
<input type=date name="dateofbirth" placeholder="Enter DateOfBirth" onfocus="change(this)"><br><br>

<input type="submit" value="Register" formaction="saveUserData" formmethod="post" id="b1">
</div>
</form>