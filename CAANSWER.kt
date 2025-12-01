package com.example.ca_1compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun registration() {
    var name by remember { mutableStateOf("") }
    var regNumber by remember { mutableStateOf("") }
    var workshopLevel by remember { mutableStateOf("") }
    var workshopDate by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
            .verticalScroll(rememberScrollState()), // Scrollable in case screens are small
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


        Text(
            text = "AI Workshop",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))


        Image(
            painter = painterResource(id = R.drawable.nature),
            contentDescription = "Workshop Nature Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
                .background(Color.LightGray)
        )

        Spacer(modifier = Modifier.height(30.dp))


        Text(
            text = "Your Name",
            modifier = Modifier.align(Alignment.Start),
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(4.dp))
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            placeholder = { Text("John Doe") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = "Registration Number",
            modifier = Modifier.align(Alignment.Start),
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(4.dp))
        OutlinedTextField(
            value = regNumber,
            onValueChange = { regNumber = it },
            placeholder = { Text("123456789") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))


        Text(
            text = "Enter Workshop Level",
            modifier = Modifier.align(Alignment.Start),
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(4.dp))
        OutlinedTextField(
            value = workshopLevel,
            onValueChange = { workshopLevel = it },
            placeholder = { Text("Beginner / Intermediate / Advanced") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // 6. Workshop Date
        Text(
            text = "Enter Workshop Date",
            modifier = Modifier.align(Alignment.Start),
            fontWeight = FontWeight.SemiBold
        )
        Spacer(modifier = Modifier.height(4.dp))
        OutlinedTextField(
            value = workshopDate,
            onValueChange = { workshopDate = it },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(32.dp))

        // 7. Button
        Button(
            onClick = { /* Action */ },
            modifier = Modifier.fillMaxWidth().height(50.dp)
        ) {
            Text(text = "Enroll Now", fontSize = 18.sp)
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun registrartionPreview() {
    registration()
}
