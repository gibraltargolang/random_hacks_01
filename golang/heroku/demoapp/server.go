package main

import (
	"encoding/json"
	"net/http"
	"os"

)
type Message struct {
	Message string `json:"message"`
}

func main() {
	http.HandleFunc("/hello", hello)
	http.ListenAndServe(":"+os.Getenv("PORT"), nil)
}

func hello(w http.ResponseWriter, r *http.Request) {
	w.Header().Set("Content-Type", "application/javascript")
	json.NewEncoder(w).Encode(&Message{"Hello, World!"})
}