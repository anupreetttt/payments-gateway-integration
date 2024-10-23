async function initCheckout() {
  try {

    const clientKey = document.getElementById('clientKey').innerHTML;
    const paymentMethodResponse = await callServer('/api/getPaymentMethods')
    const config = {
      paymentMethodResponse,
      clientKey,
      locale: 'end_US',
      environment: 'test',
      showPayButton: true,
      paymentMethodConfiguration: {
        ideal: {
          showImage: true,
        },
        card: {
          hasHolderName: true,
          holderNameRequired: true,
          name: 'Credit or Debit card',
          amount: {
            value: 1000,
            currency: 'EUR',
          },
        }
      },
      onSubmit: (state, component) => {

      },
      onAdditionalDetails: (state, component) => {

      },
    };
  } catch (error) {
    console.log(error);
    alert("Error occured look at console for more details");
  }
}

initCheckout();

async function callServer(url, data) {
  const res = await fetch(url, {
    method: 'POST',
    body: data ? JSON.stringify(data) : '',
    headers: {
      'Content-Type': 'application/json'
    }
  });

  return await res.json();
}
