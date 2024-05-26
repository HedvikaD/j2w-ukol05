[#ftl]
[#import "/spring.ftl" as spring]
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
        <h1>Registrace na letní dětský tábor</h1>
        <form method="post" action="/">
            <label for="jmeno" class="form-label">Jméno:</label>
            [@spring.formInput path="formular.jmeno" /]
            <div class="error">[@spring.showErrors "<br>"/]</div>
            <br>

            <label for="prijmeni" class="form-label">Příjmení:</label>
            [@spring.formInput path="formular.prijmeni" /]
            <div class="error">[@spring.showErrors "<br>"/]</div>
            <br>

            <label for="datumNarozeni" class="form-label">Datum narození:</label>
            [@spring.formInput path="formular.datumNarozeni" fieldType="date"/]
            <div class="error">[@spring.showErrors "<br>"/]</div>
            <br>

            <div>
                <label for="pohlavi" class="form-label">Pohlaví:</label>
            </div>
            <div>
                <input id="pohlavi1" name="pohlavi" class="form-control" type="radio">
                <label for="pohlavi1">Chlapec</label>
            </div>
            <div>
                <input id="pohlavi2" name="pohlavi" class="form-control" type="radio">
                <label for="pohlavi2">Dívka</label>
                <br>
            </div>
            [@spring.bind "formular.pohlavi"/]
            <div class="error">[@spring.showErrors "<br>"/]</div>
            <br>

            <div>
                <label for="turnus" class="radek">Turnus:</label>
            </div>
            <div>
                <input id="turnus1" name="turnus" class="form-control" type="radio">
                <label for="turnus1">Turnus od 1. do 15. 7. 2024</label>
            </div>
            <div>
                <input id="turnus2" name="turnus" class="form-control" type="radio">
                <label for="turnus2">Turnus od 15. do 30. 7. 2024</label>
            </div>
            <div>
                <input id="turnus3" name="turnus" class="form-control" type="radio">
                <label for="turnus3">Turnus od 1. do 15. 8. 2024</label>
            </div>
            [@spring.bind "formular.turnus"/]
            <div class="error">[@spring.showErrors "<br>"/]</div>
            <br>

            <label for="email" class="radek">E-mail na rodiče:</label>
            [@spring.formInput path="formular.email" /]
            <div class="error">[@spring.showErrors "<br>"/]</div>
            <br>

            <label for="telefon" class="radek">Telefon na rodiče:</label>
            [@spring.formInput path="formular.telefon" /]
            <div class="error">[@spring.showErrors "<br>"/]</div>
            <br>

            <div class="radek controls">
                <button type="submit">Registrovat</button>
            </div>
        </form>
    </main>
</body>
</html>
