<?php
/* Set e-mail recipient */
$myemail = "billy_hetfield@hotmail.com";

/* Check all form inputs using check_input function */
$name = check_input($_POST['Nombre'], "Your Name");
$email = check_input($_POST['Email'], "Your E-mail Address");
$subject = check_input($_POST['Asunto'], "Message Subject");
$message = check_input($_POST['Mensaje'], "Your Message");


/* Let's prepare the message for the e-mail */

$subject = "Someone has sent you a message";

$message = "

Someone has sent you a message using your contac form:

Nombre: $name
Email: $email
Asunto: $subject

Mensaje:
$message

";

/* Send the message using mail() function */
mail($myemail, $subject, $message);

/* Redirect visitor to the thank you page */
header('index.html');
exit();

/* Functions we used */
function check_input($data, $problem='')
{
$data = trim($data);
$data = stripslashes($data);
$data = htmlspecialchars($data);
if ($problem && strlen($data) == 0)
{
show_error($problem);
}
return $data;
}

function show_error($myError)
{
?>
<html>
<body>

<p>Please correct the following error:</p>
<strong><?php echo $myError; ?></strong>
<p>Hit the back button and try again</p>

</body>
</html>
<?php
exit();
}
?>