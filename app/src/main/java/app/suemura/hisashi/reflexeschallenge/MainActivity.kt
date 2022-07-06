package app.suemura.hisashi.reflexeschallenge

import android.content.res.ColorStateList
import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numberbutton1: Button = findViewById(R.id.numberbutton1)
        val numberbutton2: Button = findViewById(R.id.numberbutton2)
        val numberbutton3: Button = findViewById(R.id.numberbutton3)
        val numberbutton4: Button = findViewById(R.id.numberbutton4)
        val numberbutton5: Button = findViewById(R.id.numberbutton5)
        val numberbutton6: Button = findViewById(R.id.numberbutton6)
        val numberbutton7: Button = findViewById(R.id.numberbutton7)
        val numberbutton8: Button = findViewById(R.id.numberbutton8)
        val numberbutton9: Button = findViewById(R.id.numberbutton9)
        val startbutton: Button = findViewById(R.id.startbutton)
        val retirebutton: Button = findViewById(R.id.retirebutton)
        val countdowntext: TextView = findViewById(R.id.countdowntext)
        val scoretext: TextView = findViewById(R.id.scoretext)
        val susumuoto: MediaPlayer = MediaPlayer.create(this, R.raw.susumuoto)
        val modoruoto: MediaPlayer = MediaPlayer.create(this, R.raw.modoruoto)
        val fuenooto: MediaPlayer = MediaPlayer.create(this, R.raw.fuenooto)
        val seikainooto: MediaPlayer = MediaPlayer.create(this, R.raw.seikainooto)
        val fuseikai: MediaPlayer = MediaPlayer.create(this, R.raw.fuseikai)
        val countdown: MediaPlayer = MediaPlayer.create(this, R.raw.countdown)
        val kekka: MediaPlayer = MediaPlayer.create(this, R.raw.kekkanooto)

        var second = 15
        var score = 0


        var timer: CountDownTimer = object : CountDownTimer(15000, 1000) {
            override fun onFinish() {
                startbutton.isEnabled = true
                startbutton.isVisible = true
                retirebutton.isEnabled = false
                retirebutton.isVisible = false
                kekka.seekTo(0)
                kekka.start()

                numberbutton1.isEnabled = false
                numberbutton2.isEnabled = false
                numberbutton3.isEnabled = false
                numberbutton4.isEnabled = false
                numberbutton5.isEnabled = false
                numberbutton6.isEnabled = false
                numberbutton7.isEnabled = false
                numberbutton8.isEnabled = false
                numberbutton9.isEnabled = false

                numberbutton1.backgroundTintList =
                    ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
                numberbutton2.backgroundTintList =
                    ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
                numberbutton3.backgroundTintList =
                    ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
                numberbutton4.backgroundTintList =
                    ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
                numberbutton5.backgroundTintList =
                    ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
                numberbutton6.backgroundTintList =
                    ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
                numberbutton7.backgroundTintList =
                    ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
                numberbutton8.backgroundTintList =
                    ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
                numberbutton9.backgroundTintList =
                    ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
                second = 15


            }

            override fun onTick(millisUntilFinished: Long) {

                second -= 1

                countdown.seekTo(0)

                countdown.start()
                countdowntext.text = second.toString()

            }
        }




        numberbutton1.backgroundTintList = ColorStateList.valueOf(Color.rgb(107, 107, 107))
        numberbutton2.backgroundTintList = ColorStateList.valueOf(Color.rgb(107, 107, 107))
        numberbutton3.backgroundTintList = ColorStateList.valueOf(Color.rgb(107, 107, 107))
        numberbutton4.backgroundTintList = ColorStateList.valueOf(Color.rgb(107, 107, 107))
        numberbutton5.backgroundTintList = ColorStateList.valueOf(Color.rgb(107, 107, 107))
        numberbutton6.backgroundTintList = ColorStateList.valueOf(Color.rgb(107, 107, 107))
        numberbutton7.backgroundTintList = ColorStateList.valueOf(Color.rgb(107, 107, 107))
        numberbutton8.backgroundTintList = ColorStateList.valueOf(Color.rgb(107, 107, 107))
        numberbutton9.backgroundTintList = ColorStateList.valueOf(Color.rgb(107, 107, 107))

        numberbutton1.isEnabled = false
        numberbutton2.isEnabled = false
        numberbutton3.isEnabled = false
        numberbutton4.isEnabled = false
        numberbutton5.isEnabled = false
        numberbutton6.isEnabled = false
        numberbutton7.isEnabled = false
        numberbutton8.isEnabled = false
        numberbutton9.isEnabled = false
        retirebutton.isEnabled = false
        retirebutton.isVisible = false


        startbutton.setOnClickListener {
            score = 0
            scoretext.text = score.toString()
            startbutton.isEnabled = false
            startbutton.isVisible = false
            retirebutton.isEnabled = true
            retirebutton.isVisible = true

            fuenooto.seekTo(0)
            fuenooto.start()

            val decideColor = (0..1).random()

            if (decideColor == 1) {

                var hansha = arrayOf("1", "2", "3", "4", "5", "6", "7", "8", "9")
                var num = Random.nextInt(hansha.count())
                timer.start()
                when (num) {
                    0 -> {
                        numberbutton1.isEnabled = true
                        numberbutton1.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
                        numberbutton1.setOnClickListener {
                            seikainooto.seekTo(0)
                            seikainooto.start()
                            score++
                            scoretext.text = score.toString()
                            numberbutton1.backgroundTintList =
                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
                            numberbutton1.isEnabled = false
//                            var num = Random.nextInt(hansha.count())
                            when (num) {
                                0 -> {
                                    numberbutton1.isEnabled = true
                                    numberbutton1.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.teal_200
                                        )
                                    var blue = Random.nextInt(7)
                                    when (blue) {
                                        0 -> {
                                            numberbutton2.isEnabled = true
                                            numberbutton2.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        1 -> {
                                            numberbutton3.isEnabled = true
                                            numberbutton3.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        2 -> {
                                            numberbutton4.isEnabled = true
                                            numberbutton4.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        3 -> {
                                            numberbutton5.isEnabled = true
                                            numberbutton5.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        4 -> {
                                            numberbutton6.isEnabled = true
                                            numberbutton6.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        5 -> {
                                            numberbutton7.isEnabled = true
                                            numberbutton7.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        6 -> {
                                            numberbutton8.isEnabled = true
                                            numberbutton8.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        7 -> {
                                            numberbutton9.isEnabled = true
                                            numberbutton8.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }

                                    }
                                }
                                1 -> {
                                    numberbutton2.isEnabled = true
                                    numberbutton2.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.teal_200
                                        )
                                    var blue = Random.nextInt(7)
                                    when (blue) {
                                        0 -> {
                                            numberbutton1.isEnabled = true
                                            numberbutton1.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        1 -> {
                                            numberbutton3.isEnabled = true
                                            numberbutton3.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        2 -> {
                                            numberbutton4.isEnabled = true
                                            numberbutton4.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        3 -> {
                                            numberbutton5.isEnabled = true
                                            numberbutton5.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        4 -> {
                                            numberbutton6.isEnabled = true
                                            numberbutton6.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        5 -> {
                                            numberbutton7.isEnabled = true
                                            numberbutton7.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        6 -> {
                                            numberbutton8.isEnabled = true
                                            numberbutton8.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        7 -> {
                                            numberbutton9.isEnabled = true
                                            numberbutton8.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }

                                    }
                                }
                                2 -> {
                                    numberbutton3.isEnabled = true
                                    numberbutton3.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.teal_200
                                        )
                                    var blue = Random.nextInt(7)
                                    when (blue) {
                                        0 -> {
                                            numberbutton1.isEnabled = true
                                            numberbutton1.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        1 -> {
                                            numberbutton2.isEnabled = true
                                            numberbutton2.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }

                                        2 -> {
                                            numberbutton4.isEnabled = true
                                            numberbutton4.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        3 -> {
                                            numberbutton5.isEnabled = true
                                            numberbutton5.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        4 -> {
                                            numberbutton6.isEnabled = true
                                            numberbutton6.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        5 -> {
                                            numberbutton7.isEnabled = true
                                            numberbutton7.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        6 -> {
                                            numberbutton8.isEnabled = true
                                            numberbutton8.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        7 -> {
                                            numberbutton9.isEnabled = true
                                            numberbutton8.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }

                                    }
                                }
                                3 -> {
                                    numberbutton4.isEnabled = true
                                    numberbutton4.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.teal_200
                                        )
                                    var blue = Random.nextInt(8)
                                    when (blue) {
                                        0 -> {
                                            numberbutton1.isEnabled = true
                                            numberbutton1.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        1 -> {
                                            numberbutton2.isEnabled = true
                                            numberbutton2.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        2 -> {
                                            numberbutton3.isEnabled = true
                                            numberbutton3.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        3 -> {
                                            numberbutton5.isEnabled = true
                                            numberbutton5.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        4 -> {
                                            numberbutton6.isEnabled = true
                                            numberbutton6.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        5 -> {
                                            numberbutton7.isEnabled = true
                                            numberbutton7.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        6 -> {
                                            numberbutton8.isEnabled = true
                                            numberbutton8.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }
                                        7 -> {
                                            numberbutton9.isEnabled = true
                                            numberbutton8.backgroundTintList =
                                                ContextCompat.getColorStateList(
                                                    this@MainActivity,
                                                    R.color.purple_700
                                                )
                                        }

                                    }
                                }
                                4 -> {
                                    numberbutton5.isEnabled = true
                                    numberbutton5.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.teal_200
                                        )
                                }
                                5 -> {
                                    numberbutton6.isEnabled = true
                                    numberbutton6.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.teal_200
                                        )
                                }
                                6 -> {
                                    numberbutton7.isEnabled = true
                                    numberbutton7.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.teal_200
                                        )
                                }
                                7 -> {
                                    numberbutton8.isEnabled = true
                                    numberbutton8.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.teal_200
                                        )
                                }
                                8 -> {
                                    numberbutton9.isEnabled = true
                                    numberbutton9.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.teal_200
                                        )
                                }
                            }


                        }
                    }
                    1 -> {
                        numberbutton2.isEnabled = true
                        numberbutton2.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
                    }
                    2 -> {
                        numberbutton3.isEnabled = true
                        numberbutton3.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
                    }
                    3 -> {
                        numberbutton4.isEnabled = true
                        numberbutton4.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
                    }
                    4 -> {
                        numberbutton5.isEnabled = true
                        numberbutton5.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
                    }
                    5 -> {
                        numberbutton6.isEnabled = true
                        numberbutton6.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
                    }
                    6 -> {
                        numberbutton7.isEnabled = true
                        numberbutton7.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
                    }
                    7 -> {
                        numberbutton8.isEnabled = true
                        numberbutton8.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
                    }
                    8 -> {
                        numberbutton9.isEnabled = true
                        numberbutton9.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
                    }
                }
                var blue = Random.nextInt(8)
                when (blue) {
                    0 -> {
                        numberbutton1.isEnabled = true
                        numberbutton1.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.purple_700)
                    }
                    1 -> {
                        numberbutton2.isEnabled = true
                        numberbutton2.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.purple_700)
                    }
                    2 -> {
                        numberbutton3.isEnabled = true
                        numberbutton3.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.purple_700)
                    }
                    3 -> {
                        numberbutton4.isEnabled = true
                        numberbutton4.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.purple_700)
                    }
                    4 -> {
                        numberbutton5.isEnabled = true
                        numberbutton5.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.purple_700)
                    }
                    5 -> {
                        numberbutton6.isEnabled = true
                        numberbutton6.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.purple_700)
                    }
                    6 -> {
                        numberbutton7.isEnabled = true
                        numberbutton7.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.purple_700)
                    }
                    7 -> {
                        numberbutton8.isEnabled = true
                        numberbutton8.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.purple_700)
                    }
                    8 -> {
                        numberbutton9.isEnabled = true
                        numberbutton8.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.purple_700)
                    }

                }







                numberbutton1.setOnClickListener {

                    seikainooto.seekTo(0)
                    seikainooto.start()
                    score++
                    scoretext.text = score.toString()
                    numberbutton1.backgroundTintList =
                        ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
                    numberbutton1.isEnabled = false
                    var num = Random.nextInt(hansha.count())
                    when (num) {
                        0 -> {
                            numberbutton1.isEnabled = true
                            numberbutton1.backgroundTintList =
                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
                            var blue = Random.nextInt(7)
                            when (blue) {
                                0 -> {
                                    numberbutton2.isEnabled = true
                                    numberbutton2.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                1 -> {
                                    numberbutton3.isEnabled = true
                                    numberbutton3.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                2 -> {
                                    numberbutton4.isEnabled = true
                                    numberbutton4.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                3 -> {
                                    numberbutton5.isEnabled = true
                                    numberbutton5.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                4 -> {
                                    numberbutton6.isEnabled = true
                                    numberbutton6.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                5 -> {
                                    numberbutton7.isEnabled = true
                                    numberbutton7.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                6 -> {
                                    numberbutton8.isEnabled = true
                                    numberbutton8.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                7 -> {
                                    numberbutton9.isEnabled = true
                                    numberbutton8.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }

                            }
                        }
                        1 -> {
                            numberbutton2.isEnabled = true
                            numberbutton2.backgroundTintList =
                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
                            var blue = Random.nextInt(7)
                            when (blue) {
                                0 -> {
                                    numberbutton1.isEnabled = true
                                    numberbutton1.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                1 -> {
                                    numberbutton3.isEnabled = true
                                    numberbutton3.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                2 -> {
                                    numberbutton4.isEnabled = true
                                    numberbutton4.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                3 -> {
                                    numberbutton5.isEnabled = true
                                    numberbutton5.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                4 -> {
                                    numberbutton6.isEnabled = true
                                    numberbutton6.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                5 -> {
                                    numberbutton7.isEnabled = true
                                    numberbutton7.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                6 -> {
                                    numberbutton8.isEnabled = true
                                    numberbutton8.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                7 -> {
                                    numberbutton9.isEnabled = true
                                    numberbutton8.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }

                            }
                        }
                        2 -> {
                            numberbutton3.isEnabled = true
                            numberbutton3.backgroundTintList =
                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
                            var blue = Random.nextInt(7)
                            when (blue) {
                                0 -> {
                                    numberbutton1.isEnabled = true
                                    numberbutton1.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                1 -> {
                                    numberbutton2.isEnabled = true
                                    numberbutton2.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }

                                2 -> {
                                    numberbutton4.isEnabled = true
                                    numberbutton4.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                3 -> {
                                    numberbutton5.isEnabled = true
                                    numberbutton5.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                4 -> {
                                    numberbutton6.isEnabled = true
                                    numberbutton6.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                5 -> {
                                    numberbutton7.isEnabled = true
                                    numberbutton7.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                6 -> {
                                    numberbutton8.isEnabled = true
                                    numberbutton8.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                7 -> {
                                    numberbutton9.isEnabled = true
                                    numberbutton8.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }

                            }
                        }
                        3 -> {
                            numberbutton4.isEnabled = true
                            numberbutton4.backgroundTintList =
                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
                            var blue = Random.nextInt(8)
                            when (blue) {
                                0 -> {
                                    numberbutton1.isEnabled = true
                                    numberbutton1.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                1 -> {
                                    numberbutton2.isEnabled = true
                                    numberbutton2.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                2 -> {
                                    numberbutton3.isEnabled = true
                                    numberbutton3.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                3 -> {
                                    numberbutton5.isEnabled = true
                                    numberbutton5.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                4 -> {
                                    numberbutton6.isEnabled = true
                                    numberbutton6.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                5 -> {
                                    numberbutton7.isEnabled = true
                                    numberbutton7.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                6 -> {
                                    numberbutton8.isEnabled = true
                                    numberbutton8.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }
                                7 -> {
                                    numberbutton9.isEnabled = true
                                    numberbutton8.backgroundTintList =
                                        ContextCompat.getColorStateList(
                                            this@MainActivity,
                                            R.color.purple_700
                                        )
                                }

                            }
                        }
//                        4 -> {
//                            numberbutton5.isEnabled = true
//                            numberbutton5.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        5 -> {
//                            numberbutton6.isEnabled = true
//                            numberbutton6.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        6 -> {
//                            numberbutton7.isEnabled = true
//                            numberbutton7.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        7 -> {
//                            numberbutton8.isEnabled = true
//                            numberbutton8.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        8 -> {
//                            numberbutton9.isEnabled = true
//                            numberbutton9.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                    }
//
//
//                }
//                numberbutton2.setOnClickListener {
//                    seikainooto.seekTo(0)
//                    seikainooto.start()
//                    score++
//                    scoretext.text = score.toString()
//                    numberbutton2.backgroundTintList =
//                        ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
//                    numberbutton2.isEnabled = false
//                    var num = Random.nextInt(hansha.count())
//                    when (num) {
//                        0 -> {
//                            numberbutton1.isEnabled = true
//                            numberbutton1.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        1 -> {
//                            numberbutton2.isEnabled = true
//                            numberbutton2.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        2 -> {
//                            numberbutton3.isEnabled = true
//                            numberbutton3.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        3 -> {
//                            numberbutton4.isEnabled = true
//                            numberbutton4.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        4 -> {
//                            numberbutton5.isEnabled = true
//                            numberbutton5.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        5 -> {
//                            numberbutton6.isEnabled = true
//                            numberbutton6.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        6 -> {
//                            numberbutton7.isEnabled = true
//                            numberbutton7.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        7 -> {
//                            numberbutton8.isEnabled = true
//                            numberbutton8.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        8 -> {
//                            numberbutton9.isEnabled = true
//                            numberbutton9.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                    }
//
//                }
//                numberbutton3.setOnClickListener {
//                    seikainooto.seekTo(0)
//                    seikainooto.start()
//                    score++
//                    scoretext.text = score.toString()
//                    numberbutton3.backgroundTintList =
//                        ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
//                    numberbutton3.isEnabled = false
//                    var num = Random.nextInt(hansha.count())
//                    when (num) {
//                        0 -> {
//                            numberbutton1.isEnabled = true
//                            numberbutton1.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        1 -> {
//                            numberbutton2.isEnabled = true
//                            numberbutton2.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        2 -> {
//                            numberbutton3.isEnabled = true
//                            numberbutton3.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        3 -> {
//                            numberbutton4.isEnabled = true
//                            numberbutton4.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        4 -> {
//                            numberbutton5.isEnabled = true
//                            numberbutton5.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        5 -> {
//                            numberbutton6.isEnabled = true
//                            numberbutton6.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        6 -> {
//                            numberbutton7.isEnabled = true
//                            numberbutton7.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        7 -> {
//                            numberbutton8.isEnabled = true
//                            numberbutton8.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        8 -> {
//                            numberbutton9.isEnabled = true
//                            numberbutton9.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                    }
//
//                }
//                numberbutton4.setOnClickListener {
//                    seikainooto.seekTo(0)
//                    seikainooto.start()
//                    score++
//                    scoretext.text = score.toString()
//                    numberbutton4.backgroundTintList =
//                        ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
//                    numberbutton4.isEnabled = false
//                    var num = Random.nextInt(hansha.count())
//                    when (num) {
//                        0 -> {
//                            numberbutton1.isEnabled = true
//                            numberbutton1.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        1 -> {
//                            numberbutton2.isEnabled = true
//                            numberbutton2.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        2 -> {
//                            numberbutton3.isEnabled = true
//                            numberbutton3.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        3 -> {
//                            numberbutton4.isEnabled = true
//                            numberbutton4.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        4 -> {
//                            numberbutton5.isEnabled = true
//                            numberbutton5.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        5 -> {
//                            numberbutton6.isEnabled = true
//                            numberbutton6.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        6 -> {
//                            numberbutton7.isEnabled = true
//                            numberbutton7.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        7 -> {
//                            numberbutton8.isEnabled = true
//                            numberbutton8.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        8 -> {
//                            numberbutton9.isEnabled = true
//                            numberbutton9.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                    }
//
//                }
//                numberbutton5.setOnClickListener {
//                    seikainooto.seekTo(0)
//                    seikainooto.start()
//                    score++
//                    scoretext.text = score.toString()
//                    numberbutton5.backgroundTintList =
//                        ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
//                    numberbutton5.isEnabled = false
//                    var num = Random.nextInt(hansha.count())
//                    when (num) {
//
//                    }
//                }
//                numberbutton6.setOnClickListener {
//                    seikainooto.seekTo(0)
//                    seikainooto.start()
//                    score++
//                    scoretext.text = score.toString()
//                    numberbutton6.backgroundTintList =
//                        ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
//                    numberbutton6.isEnabled = false
//                    var num = Random.nextInt(hansha.count())
//                    when (num) {
//                        0 -> {
//                            numberbutton1.isEnabled = true
//                            numberbutton1.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        1 -> {
//                            numberbutton2.isEnabled = true
//                            numberbutton2.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        2 -> {
//                            numberbutton3.isEnabled = true
//                            numberbutton3.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        3 -> {
//                            numberbutton4.isEnabled = true
//                            numberbutton4.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        4 -> {
//                            numberbutton5.isEnabled = true
//                            numberbutton5.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        5 -> {
//                            numberbutton6.isEnabled = true
//                            numberbutton6.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        6 -> {
//                            numberbutton7.isEnabled = true
//                            numberbutton7.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        7 -> {
//                            numberbutton8.isEnabled = true
//                            numberbutton8.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        8 -> {
//                            numberbutton9.isEnabled = true
//                            numberbutton9.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                    }
//
//                }
//                numberbutton7.setOnClickListener {
//                    seikainooto.seekTo(0)
//                    seikainooto.start()
//                    score++
//                    scoretext.text = score.toString()
//                    numberbutton7.backgroundTintList =
//                        ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
//                    numberbutton7.isEnabled = false
//                    var num = Random.nextInt(hansha.count())
//                    when (num) {
//                        0 -> {
//                            numberbutton1.isEnabled = true
//                            numberbutton1.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        1 -> {
//                            numberbutton2.isEnabled = true
//                            numberbutton2.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        2 -> {
//                            numberbutton3.isEnabled = true
//                            numberbutton3.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        3 -> {
//                            numberbutton4.isEnabled = true
//                            numberbutton4.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        4 -> {
//                            numberbutton5.isEnabled = true
//                            numberbutton5.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        5 -> {
//                            numberbutton6.isEnabled = true
//                            numberbutton6.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        6 -> {
//                            numberbutton7.isEnabled = true
//                            numberbutton7.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        7 -> {
//                            numberbutton8.isEnabled = true
//                            numberbutton8.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        8 -> {
//                            numberbutton9.isEnabled = true
//                            numberbutton9.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                    }
//                }
//                numberbutton8.setOnClickListener {
//                    seikainooto.seekTo(0)
//                    seikainooto.start()
//                    score++
//                    scoretext.text = score.toString()
//                    numberbutton8.backgroundTintList =
//                        ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
//                    numberbutton8.isEnabled = false
//                    var num = Random.nextInt(hansha.count())
//                    when (num) {
//                        0 -> {
//                            numberbutton1.isEnabled = true
//                            numberbutton1.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        1 -> {
//                            numberbutton2.isEnabled = true
//                            numberbutton2.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        2 -> {
//                            numberbutton3.isEnabled = true
//                            numberbutton3.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        3 -> {
//                            numberbutton4.isEnabled = true
//                            numberbutton4.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        4 -> {
//                            numberbutton5.isEnabled = true
//                            numberbutton5.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        5 -> {
//                            numberbutton6.isEnabled = true
//                            numberbutton6.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        6 -> {
//                            numberbutton7.isEnabled = true
//                            numberbutton7.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        7 -> {
//                            numberbutton8.isEnabled = true
//                            numberbutton8.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        8 -> {
//                            numberbutton9.isEnabled = true
//                            numberbutton9.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                    }
//                }
//                numberbutton9.setOnClickListener {
//                    seikainooto.seekTo(0)
//                    seikainooto.start()
//                    score++
//                    scoretext.text = score.toString()
//                    numberbutton9.backgroundTintList =
//                        ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
//                    numberbutton9.isEnabled = false
//                    var num = Random.nextInt(hansha.count())
//                    when (num) {
//                        0 -> {
//                            numberbutton1.isEnabled = true
//                            numberbutton1.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//
//                        }
//                        1 -> {
//                            numberbutton2.isEnabled = true
//                            numberbutton2.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        2 -> {
//                            numberbutton3.isEnabled = true
//                            numberbutton3.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        3 -> {
//                            numberbutton4.isEnabled = true
//                            numberbutton4.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        4 -> {
//                            numberbutton5.isEnabled = true
//                            numberbutton5.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        5 -> {
//                            numberbutton6.isEnabled = true
//                            numberbutton6.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        6 -> {
//                            numberbutton7.isEnabled = true
//                            numberbutton7.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        7 -> {
//                            numberbutton8.isEnabled = true
//                            numberbutton8.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                        8 -> {
//                            numberbutton9.isEnabled = true
//                            numberbutton9.backgroundTintList =
//                                ContextCompat.getColorStateList(this@MainActivity, R.color.teal_200)
//                        }
//                    }
                    }
                    retirebutton.setOnClickListener {
                        startbutton.isEnabled = true
                        startbutton.isVisible = true
                        retirebutton.isEnabled = false
                        retirebutton.isVisible = false
                        numberbutton1.isEnabled = false
                        numberbutton2.isEnabled = false
                        numberbutton3.isEnabled = false
                        numberbutton4.isEnabled = false
                        numberbutton5.isEnabled = false
                        numberbutton6.isEnabled = false
                        numberbutton7.isEnabled = false
                        numberbutton8.isEnabled = false
                        numberbutton9.isEnabled = false

                        modoruoto.seekTo(0)
                        modoruoto.start()

                        numberbutton1.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
                        numberbutton2.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
                        numberbutton3.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
                        numberbutton4.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
                        numberbutton5.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
                        numberbutton6.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
                        numberbutton7.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
                        numberbutton8.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
                        numberbutton9.backgroundTintList =
                            ContextCompat.getColorStateList(this@MainActivity, R.color.teal_700)
                        timer.cancel()
                        second = 15
                        score = 0
                        countdowntext.text = second.toString()
                        scoretext.text = score.toString()


                    }


                }

            }
        }


    }
}