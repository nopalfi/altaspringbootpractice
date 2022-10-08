1. Get Request (v1/posts)

Mengembalikan semua data posts

2. Post Request (v1/posts)


Menerima data dalam bentuk body json
{
	"title":"New title"
	"description":"A new title description"
}


3. Delete Request (v1/posts/{id})

Menghapus post dengan variabel id: Long
Jika berhasil return value "Deleted successfully"
jika gagal return value "Error occured"

4. Perbedaan JpaRepository dan CrudRepository adalah pada JpaRepository sudah memiliki semua fitur CrudRepository ditambah dengan fitur Pagination, jadi jika ingin fitur repository yg lebih lengkap, gunakan JpaRepository
