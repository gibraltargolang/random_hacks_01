package main

import (
	"encoding/json"
	"net/http"

)
type Message struct {
	Message string `json:"message"`
}

func main() {
	http.HandleFunc("/hello", hello)
	http.ListenAndServe(":3003", nil)
}

func hello(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content-Type", "application/json")
	json.NewEncoder(w).Encode(&Message{"Hello, World!"})
}
