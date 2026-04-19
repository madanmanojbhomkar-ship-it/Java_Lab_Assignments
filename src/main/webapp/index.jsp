<!DOCTYPE html>
<html>
<head>
    <title>Student Result Form</title>
    <script>
        function validateForm() {
            let roll = document.forms["form"]["roll"].value.trim();
            let name = document.forms["form"]["name"].value.trim();

            let marks = [
                document.forms["form"]["sub1"].value,
                document.forms["form"]["sub2"].value,
                document.forms["form"]["sub3"].value,
                document.forms["form"]["sub4"].value,
                document.forms["form"]["sub5"].value
            ];

            if (roll === "" || name === "") {
                alert("Roll No and Name are required!");
                return false;
            }

            for (let i = 0; i < marks.length; i++) {
                if (marks[i] === "" || isNaN(marks[i])) {
                    alert("Enter valid marks for all subjects!");
                    return false;
                }
                let m = parseInt(marks[i]);
                if (m < 0 || m > 100) {
                    alert("Marks must be between 0 and 100!");
                    return false;
                }
            }

            return true;
        }
    </script>
</head>
<body>

<h2>Student Marks Entry</h2>

<form name="form" action="ResultServlet" method="post" onsubmit="return validateForm()">

    Roll No: <input type="text" name="roll"><br><br>
    Name: <input type="text" name="name"><br><br>

    Sub1: <input type="text" name="sub1"><br><br>
    Sub2: <input type="text" name="sub2"><br><br>
    Sub3: <input type="text" name="sub3"><br><br>
    Sub4: <input type="text" name="sub4"><br><br>
    Sub5: <input type="text" name="sub5"><br><br>

    <input type="submit" value="Calculate Result">

</form>

</body>
</html>