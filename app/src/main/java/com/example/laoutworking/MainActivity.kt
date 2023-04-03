package com.example.laoutworking

import android.content.res.Resources
import android.os.Bundle
import android.provider.MediaStore.Images
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.laoutworking.ui.theme.LaoutWorkingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent(){
            Column (
                modifier = Modifier.fillMaxSize()
                    .background(color=Color(0xfff2f2f2))

                    ){
                Image(
                    painter = painterResource(id = R.drawable.mint),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(400.dp)
                )
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = "Shampoo Mint",
                       fontSize = 26.sp
                    )

                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(text = "Best New Product",
                        fontSize = 17.sp,

                    )
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                    Text(text = "5.0 $",
                        fontSize = 17.sp,
                        color=Color(0xff85bb65)
                        )
                    Spacer(modifier = Modifier.padding(top = 10.dp))
                }
            }
        }
    }
    
}
