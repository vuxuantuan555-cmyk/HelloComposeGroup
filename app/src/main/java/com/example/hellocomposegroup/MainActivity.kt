package com.example.hellocomposegroup

import androidx.compose.ui.layout.ContentScale
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hellocomposegroup.ui.theme.HelloComposeGroupTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            HelloComposeGroupTheme {
                GroupScreen()
            }
        }
    }
}

@Composable
fun GroupScreen() {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo nhóm",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(160.dp)
                .clip(CircleShape)
        )

        Spacer(modifier = Modifier.height(19.dp))

        Text(
            text = "Nhóm Jetpack Compose",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text("1. Trương Quang Hùng", fontSize = 18.sp)
        Text("2. Võ duy Khải", fontSize = 18.sp)

        Text(
            text = "3. Vũ Xuân Tuấn",
            color = Color.Blue,
            fontSize = 20.sp
        )

        Text("4. Phạm Văn D", fontSize = 18.sp)
        Text("5. Hoàng Thị E", fontSize = 18.sp)

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            Toast.makeText(
                context,
                "Xin chào Android",
                Toast.LENGTH_SHORT
            ).show()
        }) {
            Text("Say Hello")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GroupScreenPreview() {
    HelloComposeGroupTheme {
        GroupScreen()
    }
}
