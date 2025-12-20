package io.github.santiago120600.moneytracker.ui.account

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AccountScreen(viewModel: AccountViewModel) {

    val accounts by viewModel.accounts.collectAsState(emptyList())
    val isLoading by viewModel.isLoading.collectAsState(false)

    LaunchedEffect(Unit) {
        viewModel.loadAccounts()
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Accounts") }
            )
        }
    ) { paddingValues ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            if (isLoading) {
                CircularProgressIndicator(
                    modifier = Modifier.align(Alignment.Center)
                )
            } else {
                if (accounts.isEmpty()) {
                    Text(
                        text = "No accounts found. Add your first account!",
                        modifier = Modifier.align(Alignment.Center)
                    )
                } else {
                    AccountList(accounts = accounts)
                }
            }
        }
    }
}

@Composable
fun AccountList(accounts: List<io.github.santiago120600.moneytracker.domain.model.Account>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(accounts) { account ->
            AccountCard(account = account)
        }
    }
}

@Composable
fun AccountCard(account: io.github.santiago120600.moneytracker.domain.model.Account) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = account.name,
                style = MaterialTheme.typography.titleLarge
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "Balance: $${account.balance}",
                style = MaterialTheme.typography.bodyLarge
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                if (account.closingDay != null) {
                    Text(
                        text = "Closing: ${account.closingDay}",
                        style = MaterialTheme.typography.bodySmall
                    )
                }
                if (account.dueDay != null) {
                    Text(
                        text = "Due: ${account.dueDay}",
                        style = MaterialTheme.typography.bodySmall
                    )
                }
            }
        }
    }
}