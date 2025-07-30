<h1>Question Management</h1>
${message}
<style>

div
{
text-align:center;
border:3px solid grey;
}

</style>


<div>
<form>

Qno :- <input type="text" name="qno" placeholder="Enter Question Number" value="${question.qno}"><br><br>
Question :- <input type="text" name="question" placeholder="Enter Question"  value="${question.question}"><br><br>
Option1 :- <input type="text" name="option1" placeholder="Enter Option" value="${question.option1}"><br><br>
Option2 :- <input type="text" name="option2" placeholder="Enter Option" value="${question.option2}"><br><br>
Option3 :- <input type="text" name="option3" placeholder="Enter Option" value="${question.option3}"><br><br>
Option4 :- <input type="text" name="option4" placeholder="Enter Option" value="${question.option4}"><br><br>
Answer :- <input type="text" name="answer" placeholder="Enter Answer" value="${question.answer}"><br><br>
Subject :- <input type="text" name="subject" placeholder="Enter Subject" value="${question.subject}"><br><br>

<input type="submit" value="addQuestion" formaction="addQuestion">
<input type="submit" value="viewQuestion" formaction="viewQuestion">
<input type="submit" value="updateQuestion" formaction="updateQuestion">
<input type="submit" value="deleteQuestion" formaction="deleteQuestion">



</form>
${message}
</div>

