<?php
    header('Content-type: application/json');
    $status = array(
        'type'=>'success',
        'message'=>'Gracias por Contactarnos, nos podremos en contacto con usted '
    );

    $name = @trim(stripslashes($_POST['Nombre'])); 
    $email = @trim(stripslashes($_POST['Email'])); 
    $subject = @trim(stripslashes($_POST['Asunto'])); 
    $message = @trim(stripslashes($_POST['Mensaje'])); 
    $phone = @trim(stripslashes($_POST['Telefono'])); 
    $city = @trim(stripslashes($_POST['Ciudad'])); 

    $email_from = $email;
    $email_to = 'billy_hetfield@hotmail.com';//replace with your email

    $body ='Nombre: '.$name."\n\n".'E-mail: '.$email."\n\n".'Telefono: '.$phone."\n\n".'Ciudad: '.$city."\n\n".'Asunto: '.$subject."\n\n".'Mensaje: '.$message;

    $success = @mail($email_to, $subject, $body, 'From: <'.$email_from.'>');

    echo json_encode($status);
    die;

 ?>   