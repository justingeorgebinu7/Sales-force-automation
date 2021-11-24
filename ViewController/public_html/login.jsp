<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>Login - Sales Force Automation</title>
        <link rel="icon" type="image/x-icon" href="https://i.ibb.co/G2ryNdW/logoonly.png">
        <style>
                html {
                    visibility: hidden;
                }

                body {
                    background-image: url('https://image.freepik.com/free-vector/white-minimal-background_1393-354.jpg');
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
                    border-radius: 8px;
                    text-align: center;
                    border: .5px solid #999;
                }

                .btn {
                    padding: 12px 50px;
                    background-color: #046;
                    color: white;
                    border: 0px;
                    font-size:13px;
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
                    width: 40%;
                }

                .makecenter {
                    margin-top: 50%;
                    transform: translate(0, -25%);
                }

                .text {
                    color: #334;
                    font-weight:600;
                    font-size:14px;
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
                         src="https://i.ibb.co/HrRP1ZH/logosq.jpg"/>
                     
                    <br/><div style="font-size:22px;margin-top:30px;color:#026;">Welcome</div>
                </div>
            </div>
            <div class="rightdiv" style="margin-top:13%;">
                <form method="POST" action="j_security_check" autocomplete="off">
                    <table cellspacing="0" cellpadding="15" border="0"
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
                            <td colspan="2" style="text-align:center">
                                <input class="btn" type="submit" name="submit" value="Submit"/>
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
    </body>
</html>