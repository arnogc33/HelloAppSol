<%@ page pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <title>Formulaire hello</title>
    <link type="text/css" rel="stylesheet" href="style.css" />
</head>
<body>
<form method="post" action="hello-form">
    <fieldset>
        <legend>Formulaire hello</legend>
        <h2>Bienvenue à notre formulaire</h2>

        <label for="nom">Nom</label>
        <input type="text" id="nom" name="nom" value="" size="20" maxlength="20" />
        <br />

        <label for="prenom">Prénom</label>
        <input type="text" id="prenom" name="prenom" value="" size="20" maxlength="20" />
        <br />

        <label for="heure">Heure</label>
        <input type="time" id="heure" name="heure" value="" size="20" maxlength="20" />
        <br />

        <input type="submit" value="Go!" class="sansLabel" />
        <br />
    </fieldset>
    ps : veuillez noter le superbe style du formulaire :-)
</form>
</body>
</html>