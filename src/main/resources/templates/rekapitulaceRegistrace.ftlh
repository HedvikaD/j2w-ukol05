[#ftl]
<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <title>Registrace na letní dětský tábor</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/png" href="/images/favicon.png">
    <link rel="stylesheet" href="/css/style.css" />
</head>
<body>
<main>
    <div>Dítě se jménem <strong>${jmeno} ${prijmeni}</strong>, datum narození ${datumNarozeni}, bylo úspěšně zaregistrováno na letní dětský tábor. <br> Turnus: ${turnus}</div>

            [#if email?? && email!=""]
            Na e-mail <strong>${email}</strong> bylo zasláno potvrzení.
        [/#if]
    </div>
</main>
</body>
</html>