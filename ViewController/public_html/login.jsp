<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>Login</title>
        <style>
                html {
                    visibility: hidden;
                }

                body {
                    background-image: url('https://wallpaperaccess.com/full/260172.jpg');
                    margin: 0;
                    background-size: cover;
                }

                .maindiv {
                    margin: 50px;
                    background-color: rgba(255, 255, 255, .8);
                    border-radius: 50px;
                    position: absolute;
                    top: 0;
                    left: 0;
                    right: 0;
                    bottom: 0;
                    overflow: hidden;
                }

                .rightdiv {
                    text-align: center;
                    float: left;
                }

                th td table {
                    border: none !important;
                }

                .textfield {
                    padding: 12px 20px;
                    border-radius: 10px;
                    text-align: center;
                    border: 1px solid #666;
                }

                .btn {
                    padding: 15px 60px;
                    background-color: #77b;
                    color: white;
                    border: 0px;
                    border-radius: 20px;
                    font-weight:bold;
                }

                .leftdiv {
                    width: 30%;
                    float: left;
                    height: 100%;
                    background-color: rgba(255, 255, 255, 1);
                    padding: 20px;
                    overflow: hidden;
                    text-align: center;
                }

                .leftimg {
                    width: 50%;
                }

                .makecenter {
                    margin-top: 50%;
                    transform: translate(0, -25%);
                }

                .text {
                    color: #334;
                    font-weight:600;
                }
            </style>
        <script>
          if (self == top) {
              document.documentElement.style.visibility = 'visible';
          }
          else {
              top.location = self.location;
          }
        </script>
    </head>
    <body>
        <div class="maindiv">
            <div class="leftdiv">
                <div class="makecenter">
                    <img class="leftimg" alt="img"
                         src="https://lh5.googleusercontent.com/proxy/ePIwJKGKgN766HdixXD4awTQguYogfE8teNDfkq-Ds-EX4eeOhsEjYjUZIItEsqE3JWNMEsACpkErE5j4ZV8ygiOJOAz9jvvyMpv_klKzZvkNRdnxMugGiEzgSCVEGOLQCKUPhHt8W_OjrQFi5deViXOmRWv=s0-d"/>
                     
                    <br/><div style="font-size:25px;margin-top:30px;">Welcome to Sales</div>
                </div>
            </div>
            <div class="rightdiv" style="margin-top:13%;">
                <form method="POST" action="j_security_check" autocomplete="off">
                    <table cellspacing="0" cellpadding="15" border="0px"
                           style="border:none;border-collapse:collapse;overflow:hidden;">
                        <tr>
                            <td class="text">Username</td>
                            <td>
                                <input type="text" name="j_username" class="textfield" autocomplete="off"/>
                            </td>
                        </tr>
                         
                        <tr>
                            <td class="text">Password</td>
                            <td>
                                <input type="password" name="j_password" class="textfield" autocomplete="off"/>
                            </td>
                        </tr>
                         
                        <tr>
                            <td colspan="2">
                                <input class="btn" type="submit" name="submit" value="Submit"/>
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    </body>
</html>